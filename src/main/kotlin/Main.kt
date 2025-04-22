import io.github.cdimascio.dotenv.dotenv
import java.sql.DriverManager

fun main(){
    val dotenv = dotenv()

    val url = dotenv["DB_URL"]
    val user = dotenv["DB_USER"]
    val password = dotenv["DB_PASSWORD"]

    val conn = DriverManager.getConnection(url, user, password)
    println("✅ Connected to PostgreSQL!")

    conn.close()
}