
# gravity-tool

The tool can be installed from the following updatesite into Eclipse: https://gravity-tool.github.io/updatesite

All dependencies should be installed automatically.

## Repository description:

This is the main repository under which everything is merged

## HowTo Build GRaViTY:

Requirements:
1. Eclipse Modeling Tools (tested with Mars and Neon)
2. Eclipse plugins: 
 a) MoDisco Plugin (install from Eclipse Modeling Components)
 b) eMoflon  (>= 2.23, www.emoflon.org)
 d) xtext (should be installed with eMoflon)

Get the source code:
- The whole project is hosted in a git repository via github: https://github.com/GRaViTY-Tool/gravity-tool 
- An old version is available at gitlab: https://dev.kom.e-technik.tu-darmstadt.de/gitlab/es-projects/gravity
- For student theses every student should get his/her own branch

Structure of the git Repository:
- evaluation
--> Evaluation projects for automating the evaluation of different papers.
- implementation
--> The implementation of the GRaViTY tool. 
- build
--> The feature projects and updatesite 

Build:
1. Import all projects from the GRaViTY_Implementation into eclipse
2. Refresh all projects
3. Build all projects with the eMoflon build command
6. Tweak memory in runtime configuration arguments to avoid GC or Heap Errors
   when processing larger projects with GRaViTY.
   (e.g. to "-Xms1024m, -Xmx4096m, XXMaxPermSize512m" or depending on the amount 
   of memory installed in your machine even higher values for "-Xmx")
