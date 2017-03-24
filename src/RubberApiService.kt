import java.util.*

object RubberApiService {

    @JvmStatic fun main(args: Array<String>) {

        val timer = Timer()
        val newsTask = NewsTask::class
        val ussTask = USSPriceTask::class
        val rssTask = RSSPriceTask::class
        val localTask = LocalPriceTask::class

        timer.scheduleAtFixedRate(newsTask.objectInstance, 0, 3600000)
        timer.scheduleAtFixedRate(ussTask.objectInstance, 0, 3600000)
        timer.scheduleAtFixedRate(rssTask.objectInstance, 0, 3600000)
        timer.scheduleAtFixedRate(localTask.objectInstance, 0, 3600000)

    }

}