# [opsu!](https://itdelatrisu.github.io/opsu/)
**opsu!** is an unofficial open-source client for the rhythm game
[osu!](https://osu.ppy.sh/), written in Java using
[Slick2D](http://slick.ninjacave.com/) and  [LWJGL](http://lwjgl.org/)
(wrappers around OpenGL and OpenAL).

opsu! runs on Windows, OS X, and Linux.

This is a fork of the [Android port](https://github.com/fluddokt/opsu) of [opsu!](https://github.com/itdelatrisu/opsu) for inclusion in the [F-Droid](https://f-droid.org) app store.

## Building
Before building, make sure that all of the git submodules are up to date:

`git submodule update`

Then build with the standard Android Studio Gradle tasks:

`./gradlew assembleDebug`

Output will be in `android/build/outputs/apk/`

## License
**This software is licensed under GNU GPL version 3.**
You can find the full text of the license [here](LICENSE).
