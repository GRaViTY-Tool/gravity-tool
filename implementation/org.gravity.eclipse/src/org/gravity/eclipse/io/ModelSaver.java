package org.gravity.eclipse.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This class provides the functionality to save a model into an eclipse file
 * 
 * @author speldszus
 *
 */
public class ModelSaver {
	
	private static final Logger LOGGER = Logger.getLogger(ModelSaver.class);

	/**
	 * Save a emf model into an eclipse file
	 * 
	 * @param model The model
	 * @param file An eclipse file
	 * @param monitor A progress monitor
	 * @return true, iff the model has been saved successfully
	 */
	public static boolean saveModel(EObject model, IFile file, IProgressMonitor monitor) {
		if (model == null) {
			return false;
		}
		Resource resource = model.eResource();
		if(resource == null){
			return false;
		}
		
		try {

			PipedInputStream in = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream(in);
			
			Runnable rout =  () -> {
				try {
					resource.save(out, Collections.EMPTY_MAP);
					out.close();
				} catch (IOException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			};
			Runnable rin = () -> {
				try {
					if(file.exists()){
						file.setContents(in, true, false, monitor);
					}
					else{
						IContainer parent = file.getParent();
						if(!parent.exists()){
							IFolder folder = parent.getProject().getFolder(parent.getProjectRelativePath());
							folder.create(true, true, monitor);
						}
						file.create(in, true, monitor);
					}
					in.close();
				} catch (CoreException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				} catch (IOException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			};
			new Thread(rout).start();
			new Thread(rin).start();
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}
		return true;
	}
}
