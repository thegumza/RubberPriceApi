import task.LocalPriceTask
import task.NewsTask
import task.RSSPriceTask
import task.USSPriceTask
import java.util.*

object RubberApiService {

    var timer = Timer()
    var newsTask = NewsTask
    var ussTask = USSPriceTask
    var rssTask = RSSPriceTask
    var localTask = LocalPriceTask

    @JvmStatic fun main(args: Array<String>) {
        timer.scheduleAtFixedRate(newsTask, 0, 3600000)
        timer.scheduleAtFixedRate(ussTask, 0, 3600000)
        timer.scheduleAtFixedRate(rssTask, 0, 3600000)
        timer.scheduleAtFixedRate(localTask, 0, 3600000)

    }

}