import java.io.*
import java.util.*

fun main(args: Array<String>) {

    //저장매체 : file, Database
    val outstring:String = "안녕하세요 Hello"
    val path = "C:\\myfile\\myfile.txt"

    //파일 목록
    val files = File("C:\\").listFiles()
    println(Arrays.toString(files))

    //파일 복사
    //File(path).copyTo(File("C:\\myfile\\myfile2.txt"))

    //파일 내용 출력
    File(path).forEachLine { println(it) }

    //text로 읽기
    val text = File(path).readText()
    println(text)

    /*
    //파일 읽기
    val file = File("C:\\myfile\\myfile.txt")
    val inputStream1:InputStream = file.inputStream()
    val inputStreamReader1 = InputStreamReader(inputStream1)
    var line:String?
    val br = BufferedReader(inputStreamReader1)
    val sb = StringBuffer()

    try{
        line = br.readLine()
        while(line != null){
            sb.append(line, "\n")
            line = br.readLine()
        }
        println(sb)
    }catch(e:Exception){
        e.printStackTrace()
    }finally{
        br.close()
    }
    */

    //use를 사용할 수 있다 <-- kotlin
    val file = File(path)
    val inputStream1:InputStream = file.inputStream()
    val readText = inputStream1.bufferedReader().use { it.readText() }
    println("use = "+readText)

    //useLines
    val bufferReader = File(path).bufferedReader()
    val lineList = mutableListOf<String>()
    bufferReader.useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach{ println("useLines = "+it) }

    //파일 쓰기
    val str:String = "안녕하세요. \r\n hello"
    val fpath = "C:\\myfile\\testfile.txt"

    //File(fpath).bufferedWriter().use{ it.write(str) }
    File(fpath).printWriter().use{ it.println(str) }

    /*
     val writer = FileWriter(fpath)
     try {
         writer.write(str)
     }catch (e:Exception){
     } finally {
         writer.close()
     }
     */


}