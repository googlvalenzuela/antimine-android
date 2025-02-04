package dev.lucasnlm.antimine.playgames.viewmodel

import android.app.Activity
import dev.lucasnlm.antimine.R
import dev.lucasnlm.antimine.core.models.Analytics
import dev.lucasnlm.antimine.core.viewmodel.StatelessViewModel
import dev.lucasnlm.antimine.playgames.model.PlayGamesItem
import dev.lucasnlm.external.AnalyticsManager
import dev.lucasnlm.external.PlayGamesManager

class PlayGamesViewModel(
    private val playGamesManager: PlayGamesManager,
    private val analyticsManager: AnalyticsManager,
) : StatelessViewModel<PlayGamesEvent>() {

    val playGamesItems = listOf(
        PlayGamesItem(
            id = 0,
            iconRes = R.drawable.games_achievements,
            stringRes = R.string.achievements,
            triggerEvent = PlayGamesEvent.OpenAchievements,
        ),
        PlayGamesItem(
            id = 1,
            iconRes = R.drawable.games_leaderboards,
            stringRes = R.string.leaderboards,
            triggerEvent = PlayGamesEvent.OpenLeaderboards,
        ),
    )

    fun openAchievements(activity: Activity) {
        analyticsManager.sentEvent(Analytics.OpenAchievements)
        playGamesManager.openAchievements(activity)
    }

    fun openLeaderboards(activity: Activity) {
        analyticsManager.sentEvent(Analytics.OpenLeaderboards)
        playGamesManager.openLeaderboards(activity)
    }
}
