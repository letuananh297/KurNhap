import view.PhoneBookUI
import javax.swing.SwingUtilities

fun main() {
    SwingUtilities.invokeLater {
        val ticTacToeUi = PhoneBookUI()
        ticTacToeUi.isVisible = true
    }
}