
# GRaViTY-Tool
The GRaViTY tool is a research prototype for the analysis of software design and security, evaluation and execution of refactorings and automated software optimization.

- Sebastian Ruland, Géza Kulcsár, Erhan Leblebici, Sven Peldszus, Malte Lochau: Controlling the Attack Surface of Object-Oriented Refactorings. In: Proceedings of the 21st International Conference on Fundamental Approaches in Software Engineering (FASE), pp. 38-55, April 2018 - [paper - open access](http://dx.doi.org/10.1007/978-3-319-89363-1_3)
- Sven Peldszus, Géza Kulcsár, Malte Lochau, Sandro Schulze: On Continuous Detection of Design Flaws in Evolving Object-Oriented Programs using Incremental Multi-pattern Matching. In: Proceedings of the Conference on Software Engineering (SE), Gesellschaft für Informatik, 2018 - [paper](http://dl.gi.de/20.500.12116/16314)
- Sven Peldszus, Géza Kulcsár, Malte Lochau, Sandro Schulze: Continuous Detection of Design Flaws in Evolving Object-Oriented Programs using Incremental Multi-pattern Matching. In: Proceedings of the 31st International Conference on Automated Software Engineering (ASE), September 2016 - [preprint](http://rgse.uni-koblenz.de/web/pages/people/peldszus/publications/SKL2016-ContinuousDetectionOfDesignFlawsInEvolvingObject-OrientedProgramsUsingIncrementalMulti-PatternMatching-preprint.pdf)
- Sven Peldszus, Géza Kulcsár, Malte Lochau, Sandro Schulze: Incremental Co-Evolution of Java Programs based on Bidirectional Graph Transformation. In: Proceedings of the Principles and Practices of Programming on The Java Platform (PPPJ), ACM, pp. 138-151, 2015 - [paper](http://dx.doi.org/10.1145/2807426.2807438)
- Sven Peldszus, Géza Kulcsár, Malte Lochau: A Solution to the Java Refactoring Case Study using eMoflon. In: Tassilo Horn, Filip Krikava, Louis Rose (editors): Proceedings of the 8th Transformation Tool Contest (TTC), CEUR Workshop Proceedings, pp. 118-122, July 2015 - [paper - open access](http://ceur-ws.org/Vol-1524/paper20.pdf)
- Géza Kulcsár, Sven Peldszus, Malte Lochau: Object-oriented Refactoring of Java Programs using Graph Transformation. In: Tassilo Horn, Filip Krikava, Louis Rose (editors): Proceedings of the 8th Transformation Tool Contest (TTC), CEUR Workshop Proceedings, pp. 53-82, July 2015 - [paper - open access](http://ceur-ws.org/Vol-1524/paper3.pdf)

## Installation

The tool can be installed from the following updatesite into Eclipse: https://gravity-tool.github.io/updatesite

All dependencies should be installed automatically.

## Repository description

This is the main repository under which everything is merged

## HowTo Build GRaViTY

Requirements:
1. Eclipse Modeling Tools (tested with Mars and Neon)  
2. Eclipse plugins:   
 a) MoDisco Plugin (install from Eclipse Modeling Components)  
 b) eMoflon::IBEX  (www.emoflon.org)  
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
   
## Developers
 - Sven Peldszus
 - Sebastian Ruland
 - Géza Kulcsár
 - ...
 
 See also the list of [contributors](https://github.com/GRaViTY-Tool/gravity-tool/graphs/contributors) who participated in this project.

## License
This project is licensed under the Eclipse Public License - seet the [LICENSE](https://github.com/GRaViTY-Tool/gravity-tool/blob/master/LICENSE) file for details.

## Contact
Sven Peldszus (speldszus@uni-koblenz.de)  
University of Koblenz-Landau  
Universitätsstraße 1  
56073 Koblenz  
Germany
