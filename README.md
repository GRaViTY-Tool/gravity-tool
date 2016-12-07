# gravity-tool

## Repository description:

Main repository under which everything is merged

## HowTo Build GRaViTY:

Requirements:
1. Eclipse Modeling Tools (tested with Mars and Neon)
2. Eclipse plugins: 
 a) MoDisco Plugin (install from Eclipse Modeling Components)
 b) eMoflon  (>= 2.23, www.emoflon.org)
 c) Eclipse Zest (Use the Eclipse update manager to install the 
    "Graphical Editing Framework Zest Visualization Toolkit")
 d) xtext (should be installed with eMoflon)
3. Enterprise Architect with eMoflon plugin (www.emoflon.org)

Get the source code:
- The whole project is hosted in a git repository via gitlab: 
	https://dev.kom.e-technik.tu-darmstadt.de/gitlab/es-projects/gravity
- Every student should get his/her own branch

Structure of the git Repository:
- GRaViTY_Evaluation
--> Evaluation projects for automating the evaluation of different papers.
- GRaViTY_Examples
--> Open source sample projects used for testing and evaluation.
- GRaViTY_Implementation
--> The implementation of the GRaViTY tool. 

Build:
1. Import all projects from the GRaViTY_Implementation into eclipse
2. Run the MWE2 build script stored in the package "org.gravity.arte.testdsl"
   in the "src" folder of the "org.gravity.arte.testdsl" project
3. Refresh all projects
4. Export all meta models from the "org.gravity.metamodel.*" projects.
5. Build all projects with the eMoflon build command
6. Tweak memory in runtime configuration arguments to avoid GC or Heap Errors
   when processing larger projects with GRaViTY.
   (e.g. to "-Xms1024m, -Xmx4096m, XXMaxPermSize512m" or depending on the amount 
   of memory installed in your machine even higher values for "-Xmx")
