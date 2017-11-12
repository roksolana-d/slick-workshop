
import slick.jdbc.JdbcType
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.duration._

package object models {

  implicit val durationToLongMapper: JdbcType[Duration] =
    MappedColumnType.base[Duration, Long](_.toSeconds,_.seconds)
}
