package org.gravity.eclipse.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class ModelSaver {
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
					e.printStackTrace();
				}
			};
			Runnable rin = () -> {
				try {
					if(file.exists()){
						file.setContents(in, true, false, monitor);
					}
					else{
						file.create(in, true, monitor);
					}
					in.close();
				} catch (CoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
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
