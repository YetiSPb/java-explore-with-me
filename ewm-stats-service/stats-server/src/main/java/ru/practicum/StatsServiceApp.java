package ru.practicum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatsServiceApp {

    private static String LOGO = "  ................................................\n" +
            "............:~~~!~~~^^^^^^^^^^~~~!!~~:............\n" +
            "..........^^!YYPG5YYJJJ?????JJYY5GPYJ!^^..........\n" +
            "........::JJ5GG##BGGPPP55555PPGGB##GP5J?:::.......\n" +
            ".......~??PGB#######BGGPGGPGGG#######BP5J?^.:.....\n" +
            ".......!PPB############################BPP!.:::...\n" +
            ".....:.7BB##############################BB7.:::...\n" +
            "....:Y5PBB^::::::::::::.:::::::::::::::^BBP5J:::.:\n" +
            "...::GBBBG       .~^  :7777.       ~~   GBBBP:::::\n" +
            "...::PBBBB~^     :!~^^P&&&&J^:     ~!~^~BBBBP:::::\n" +
            "...::5PGBB#&! ...  .BBBBBBBB#P  .... Y&#BBGPY:::::\n" +
            "...::::!55#######57?JJJJJJJJJJ??P###B##B55!:::::::\n" +
            "...::::!Y5#######5?Y@@@@@@@@@&?7G######BYY~:::::::\n" +
            "...::::~??Y55P555?!7JYYYYYYYYJ!!J555555Y?7~:::::::\n" +
            "...:::::^^!!77777!~~^^^^^^^^^^~~!!!777!!^^^:::::::\n" +
            ".....::::::^^^^^^^^^7??7?????7^^^^^^^^^:::::::::.:\n" +
            ".....:::::::::::::::B########B:::::::::::::::::...\n" +
            "......::::^^~~~~~^^^B########B^^^~~~~~~^:::::::...\n" +
            "........::&@@@@@@#BB##########GG#@@@@@@&:::::.....\n" +
            ".......?&&@@@@@@@@@@BB##BBB###@@@@@@@@@@&&J.......\n" +
            "...... Y@@@@@@@@@@@@&&&&&&&&&&@@@@@@@@@@@@Y.......\n" +
            "...... Y@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Y ......\n\n\n";

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(StatsServiceApp.class);
        springApplication.setBanner((environment, sourceClass, out) -> out.println(LOGO));
        springApplication.run(args);
    }
}
