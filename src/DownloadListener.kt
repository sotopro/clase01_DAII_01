interface DownloadListener {
    fun onDownloadStarted()
    fun onDownloadComplete(file: String)
    fun onProgressUpdate(progress: Int)
}