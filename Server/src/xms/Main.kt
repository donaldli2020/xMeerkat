package xms


object Main {

    @JvmStatic fun main (args: Array<String>) : Unit {

        println("\nRunning xMeerkat on http://localhost:80 and http://localhost:443\n")

        val HTTP : Thread = Thread {
            Runner80.main()
        }

        val HTTPS : Thread = Thread {
            Runner443.main()
        }


        MAPS.addMaps()

        HTTP.start()
        HTTPS.start()


    }

}
