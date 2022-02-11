package horstman.tasks

import java.awt.datatransfer._

object str69num11 extends  App{
  val flavors = SystemFlavorMap.getDefaultFlavorMap.
    asInstanceOf[SystemFlavorMap]
  var arrBuffer = flavors.getNativesForFlavor(DataFlavor.imageFlavor).toArray().toBuffer
  print(arrBuffer.toString())
}
