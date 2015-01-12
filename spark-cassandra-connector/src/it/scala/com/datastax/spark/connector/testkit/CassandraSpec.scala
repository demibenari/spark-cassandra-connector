package com.datastax.spark.connector.testkit

import com.datastax.driver.scala.core.CassandraCluster
import com.datastax.driver.scala.embedded._

/** Used for IT tests. */
trait CassandraSpec extends EmbeddedCassandra {

  def clearCache(): Unit = CassandraCluster.evictCache()

}