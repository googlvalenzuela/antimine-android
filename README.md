# Antimine - Minesweeper
![Android CI](https://github.com/lucasnlm/antimine-android/workflows/Android%20CI/badge.svg) [![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0) [![GitHub release](https://img.shields.io/github/release/lucasnlm/antimine-android.svg?maxAge=60)](https://github.com/lucasnlm/antimine-android/releases) [![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/) [![crowdin](https://badges.crowdin.net/antimine-android/localized.svg)](https://crowdin.com/project/antimine-android)

### Description

Antimine is a minesweeper-like puzzle game. The objective is to flag the spaces with mines to make the field a safer place without exploding any of them.

You win the game when you've flagged every mine in the minefield. Be careful not to trigger one!

### Donate

[![Donate with Bitcoin](https://en.cryptobadges.io/badge/micro/1CG9cyRHkVMW3onjDmXVNzDawnX1ydSWiM)](https://en.cryptobadges.io/donate/1CG9cyRHkVMW3onjDmXVNzDawnX1ydSWiM) [![Donate with Ethereum](https://en.cryptobadges.io/badge/micro/0x8982aA55e7CEB31691854A8f2CD8F2203dC5543c)](https://en.cryptobadges.io/donate/0x8982aA55e7CEB31691854A8f2CD8F2203dC5543c) [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/donate?hosted_button_id=49XX9XDNUV4SW)

### Contributing

Feel free to contribute with [issues](https://github.com/lucasnlm/antimine-android/issues), [feature requests](https://github.com/lucasnlm/antimine-android/issues), [pull requests](https://github.com/lucasnlm/antimine-android/pulls), or [translating](https://crowdin.com/project/antimine-android).

### Download

<a href="https://f-droid.org/packages/dev.lucanlm.antimine/">
    <img src="https://raw.githubusercontent.com/lucasnlm/antimine-android/master/.github/fdroid.png" alt="Get it on F-Droid" height="80"/>
</a>
<a href="https://play.google.com/store/apps/details?id=com.logical.minato">
    <img src="https://raw.githubusercontent.com/lucasnlm/antimine-android/master/.github/google_play.png" alt="Get it on Google Play" height="80"/>
</a>

### Screeshots

<p align="center">
    <img src="https://github.com/lucasnlm/antimine-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png" width="200px"/>
    <img src="https://github.com/lucasnlm/antimine-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png" width="200px"/>
    <img src="https://github.com/lucasnlm/antimine-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png" width="200px"/>
    <img src="https://github.com/lucasnlm/antimine-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/5.png" width="200px"/>
</p>

## Features

- No guessing algorithm
- Multiple Themes (including System and AMOLED)
- Game Levels: Begginner, Intermediate, Expert, and Custom
- Game Statistics
- Android Wear OS support
- Save/Resume state when Quit/Resume game
- Resume previous saved games
- Retry failed games
- Continue after click on a mine
- 4 different control styles
- Custom long press duration
- Optional Question mark
- Open multiple areas by pressing numbers
- Game assistant to auto-flag discovered mines
- Split screen
- Zoom out
- Custom appearance (square roundedness, size and divider)

## Technical Details

- [Android SDK 30](https://developer.android.com/about/versions/11)
- [AndroidX](https://developer.android.com/jetpack/androidx)
- [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle)
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)
- [Koin](https://github.com/InsertKoinIO/koin)
- [Room](https://developer.android.com/training/data-storage/room)
- [Robolectric](http://robolectric.org/)
