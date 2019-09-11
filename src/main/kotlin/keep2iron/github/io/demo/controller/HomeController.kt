package keep2iron.github.io.demo.controller

import keep2iron.github.io.demo.data.BaseResponse
import keep2iron.github.io.demo.data.Movie
import keep2iron.github.io.demo.data.Recommend
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class HomeController {

    @RequestMapping("/api/index/movie")
    @ResponseBody
    fun home(page: Int): BaseResponse<List<Movie>> {
        Thread.sleep(300)
        val list = if (page < 2) {
            val list = arrayListOf<Movie>()
            for (i in 0 until 5) {
                list.add(Movie())
            }
            list
        } else {
            Collections.emptyList<Movie>()
        }

        return BaseResponse(list)
    }


    @RequestMapping("/api/index/recommend")
    @ResponseBody
    fun recommend(page: Int): BaseResponse<List<Recommend>> {
        Thread.sleep(5000)
        val list = if (page < 2) {
            val list = arrayListOf<Recommend>()
            for (i in 0 until 5) {
                list.add(Recommend())
            }
            list
        } else {
            Collections.emptyList<Recommend>()
        }

        return BaseResponse(list)
    }

}