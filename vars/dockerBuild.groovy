def call( String gitCommitTag, String gitPreCommitTag, String systemName ){

    println 'System:========== ' + systemName
    println 'git commit Tag:========== ' + gitCommitTag
    println 'git pre commit Tag:========== ' + gitPreCommitTag
    
    def dockerBuildTag = systemName.trim() + '-' + gitCommitTag.trim()
    def dockerPreBuildTag = systemName.trim() + '-' + gitPreCommitTag.trim()

    def existPreBuildTag = sh (script: "docker images ${dockerPreBuildTag}", returnStdout: true)
    String[] preBuildTag = existPreBuildTag.split("\n")

    if( preBuildTag.length > 1 ){
        sh """
            docker tag "${dockerPreBuildTag}" "${dockerPreBuildTag:"backup"}"
            docker build -t "${dockerBuildTag}" .
        """
    }else{
        sh """
            docker build -t "${dockerBuildTag}" .
        """
    }
}