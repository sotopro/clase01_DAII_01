
fun main() {
    val downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {
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
    downloader.downloadFile("newSong.mp3")
}