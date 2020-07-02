package navmap;

/*
 * Author: Beatrice Klebe
 * NetID: bklebe
 */

import navmap.controller.Launcher;

final class Map {
    private Map() {}

    public static void main(final String[] args) {
        var launcher = new Launcher(args);
        launcher.launch();
    }
}
