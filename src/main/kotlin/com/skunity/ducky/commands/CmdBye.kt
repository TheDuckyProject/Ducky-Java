package com.skunity.ducky.commands

import com.skunity.ducky.cmdapi.DuckyCommand
import com.skunity.ducky.cmdapi.Rank
import com.skunity.ducky.random
import com.skunity.ducky.sendWithTyping
import net.dv8tion.jda.core.entities.Message

/**
 * @author NanoDankster
 */
object CmdBye : DuckyCommand() {
    init {
        name = "Say Bye"
        description = "Don't go! :("
        syntax = listOf("bye %bot%", "%bot% bye", "%bot% see you")
        minRank = Rank.Everyone
    }

    override fun execute(message: Message, arguments: List<Any>) {
        message.channel.sendWithTyping(arrayOf(
                ":wave:",
                "Goodbye!",
                "Baiii \\<3",
                "See ya!",
                "You're going?! Cya \\:(",
                "Bye :wave:"
        ).random())
    }
}