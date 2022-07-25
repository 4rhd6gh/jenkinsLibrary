def call( String gitCommitTag, String gitPreCommitTag, String systemName ){

    println 'System:========== ' + systemName
    println 'git commit Tag:========== ' + gitCommitTag
    println 'git commit Tag:========== ' + gitPreCommitTag
    
    sh """
    
    docker images --filter=reference='${systemName}*:latest'
    docker tag (docker images --filter=reference='${systemName}*:latest') (${systemName}:before)

    docker build -t "${systemName}${gitCommitTag}" .
    """
}