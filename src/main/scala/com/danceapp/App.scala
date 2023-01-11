package com.danceapp

import slinky.core._
import slinky.core.annotations.react
import slinky.native._

import scala.scalajs.js.Dynamic.literal
import slinky.core.facade.ReactElement

import java.util.UUID

@react class App extends Component {
  type Props = Unit
  type State = Unit

  def initialState: State = ()

  val baseStyle = literal(
    backgroundColor = "white",
    padding = 50,
    flex = 1,
    flexDirection = "column",
    justifyContent = "center",
    alignItems = "center"
  )

  override def render(): ReactElement = {

    View(
      style = baseStyle
    )(
      Image(
        source = ImageURISource(
          uri = "https://raw.githubusercontent.com/shadaj/slinky/master/logo.png"
        ),
        style = literal(
          width = 250,
          height = 250,
          borderRadius = 250 / 2
        ),
        resizeMode = "cover"
      ),
      Text(
        style = literal(fontSize = 30, color = "red")
      )(s"Hello, Slinky!"),
      Text(
        style = literal(fontSize = 30, color = "red")
      )(s"Printing a new UUID - ${UUID.randomUUID()}")

    )
  }

}
