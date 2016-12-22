# gradle-groovy-hello
This is a template project for gradle/groovy usage

I will use docker-gradle to build this project as follows

```in .bashrc
alias gradle='docker run -it -v `pwd`:/usr/bin/app  niaquinto/gradle'
```
Then in gradle-groovy-hello dir, run:
gradle build

