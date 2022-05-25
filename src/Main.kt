class App: DownloadListener {
    override fun onDownloadStarted() {
        println("Download started")
    }

    override fun onDownloadComplete(file: String) {
        println("$file downloaded")
    }

    override fun onProgressUpdate(progress: Int) {
        println("$progress% downloaded")
    }

}
fun main() {
    val downloaderListener = App()
    val downloader = Downloader()
    downloader.downloadListener = downloaderListener
    downloader.downloadFile("newSong.mp3")
}