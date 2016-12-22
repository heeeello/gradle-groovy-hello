# gradle-groovy-hello
This is a template project for gradle/groovy usage

I will use docker-gradle to build this project as follows:

First in ~/.bashrc, add:
```
alias gradle='docker run -it -v `pwd`:/usr/bin/app  niaquinto/gradle'
```
Then source it:
```
source ~/.bashrc
```
Then in gradle-groovy-hello dir, run:
```
gradle build
```
Then you could run jar as follows:
```
java -jar build/libs/gs-gradle-0.1.0.jar
```
