//---------------------------------------------------
//  Generated content, modify:
//  logic/generateLogic.gradle
//  if necessary - enjoy the day 🙂
//---------------------------------------------------

package ch.tutteli.atrium.scala2.logic

import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.domain.creating.changers.ExtractedFeaturePostStep
import ch.tutteli.atrium.logic.ListKt
import ch.tutteli.atrium.scala2.logic._

class ListLogic[(container: AssertionContainer[[]) {


    def get[T : List[E]](index: Int): ExtractedFeaturePostStep[T, E] = ListKt.get(container, index)
}
