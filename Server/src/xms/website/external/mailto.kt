package xms.website.external

import java.io.FileReader

/** mailto */
object mailto {

    @JvmStatic val htmlContents : String = FileReader("external-redirect/mailto.html").readText()

    @JvmStatic fun getMinified () : String {

        val output : StringBuilder = StringBuilder()
        val ary : List<String> = htmlContents.split("\n")

        for (line in ary) {

            val toR = line.replace("\n", "").replace("\t", "")

            if (toR.startsWith("<!--") && toR.endsWith("-->")) {
                continue
            }
            output.append(toR)
        }

        return output.toString()
    }
}