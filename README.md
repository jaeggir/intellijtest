# Instructions

* git clone git@github.com:jaeggir/intellijtest.git
* Open with IntelliJ 14
* mvn release:prepare release:perform -Darguments="-Dmaven.deploy.skip=true"
* Observe .idea/artifacts/*  -> version does not change
