import java.util.*

object RubberApiService {

    var timer = Timer()
    var newsTask: NewsTask? = null
        get() = NewsTask
    var ussTask: USSPriceTask? = null
        get() = USSPriceTask
    var rssTask: RSSPriceTask? = null
        get() = RSSPriceTask
    var localTask: LocalPriceTask? = null
        get() = LocalPriceTask

    @JvmStatic fun main(args: Array<String>) {
        timer.scheduleAtFixedRate(newsTask, 0, 3600000)
        timer.scheduleAtFixedRate(ussTask, 0, 3600000)
        timer.scheduleAtFixedRate(rssTask, 0, 3600000)
        timer.scheduleAtFixedRate(localTask, 0, 3600000)

    }

}