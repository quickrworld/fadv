node {
    stage ("git checkout") {
        bat "echo checkout..."
        bat "cd"
        bat "dir"
        git "https://github.com/quickrworld/fadv.git"
        bat "cd"
        bat "dir"
    }
    stage ("Build") {
        bat "dir"
        bat "mvn clean install"
        dir("fadv/target") {
            bat "dir"
            bat "java -cp fadv-1.0-SNAPSHOT.jar;%CLASSPATH% com.quickrworld.test.fadv.App"
        }
    }
}