package org.bitcoins.core.protocol

import org.bitcoins.core.util.{ BitcoinSLogger, BitcoinSUtil }

/**
 * Created by chris on 1/14/16.
 * This represents a element that can be serialized to
 * be sent over the network
 */
abstract class NetworkElement {

  /** The size of the NetworkElement in bytes. */
  def size: Int = bytes.size

  /** The hexadecimal representation of the NetworkElement */
  def hex: String = BitcoinSUtil.encodeHex(bytes)

  /** The byte representation of the NetworkElement */
  def bytes: Seq[Byte]

  lazy val logger = BitcoinSLogger.logger
}
