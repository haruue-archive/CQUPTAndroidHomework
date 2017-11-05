package moe.haruue.helloworld.model

import android.support.annotation.DrawableRes

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
data class Chat(
        @DrawableRes val avatarRes: Int,
        val text: String
)