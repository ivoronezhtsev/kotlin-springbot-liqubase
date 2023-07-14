import com.example.demo.Car
import com.example.demo.Direction
import com.example.demo.Utils
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * Изучение kotlin
 * Написать репозиторий сотрудников, в котором будет метод возвращающий список сотрудников.
 * Написать сервис в котором будет какая-то логика по работе с сотрудниками, например для сотрудников у которых зп ниже 200
 * проставить в табличку "Индексация зп" признак о повышении.
 * Протестировать логику на моках и на in memory db (liquebase hsqldb
 */
class Tests {

    @Test
    fun elvisNull() {
        val name: String? = null
        val length = name?.length ?: 0
        assertTrue(length == 0)
    }

    @Test
    fun elvisNotNull() {
        val name: String? = "abc"
        val length = name?.length ?: 0
        assertTrue(length == 3)
        val utils = Utils
        println(utils.square(3))
        val car = Car()
        car.parking()
    }

    fun Car.parking() {
        // функция расширение не видит private поле
        this.direction = Direction.PARKING
        println("P")
    }
}