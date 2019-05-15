node {
    stage ("git checkout") {
        git "https://github.com/quickrworld/fadv.git"
    }
    stage ("Build") {
        dir("fadv") {
            sh "mvn clean install"
        }
        dir("fadv/target") {
            sh "java -cp fadv-1.0-SNAPSHOT.jar;%CLASSPATH% com.quickrworld.test.fadv.App"
        }
    }
}