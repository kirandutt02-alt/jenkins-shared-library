def call(String channel, String message) {
    slackSend(
        channel: channel,
        message: message,
        tokenCredentialId: 'slack-token'
    )
}
