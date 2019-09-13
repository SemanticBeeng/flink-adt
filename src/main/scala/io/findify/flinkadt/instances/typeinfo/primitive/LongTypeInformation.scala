package io.findify.flinkadt.instances.typeinfo.primitive

import io.findify.flinkadt.api.typeinfo.{ AtomicTypeInformation, MappedComparator }
import org.apache.flink.api.common.ExecutionConfig
import org.apache.flink.api.common.typeutils.{ TypeComparator, TypeSerializer }
import org.apache.flink.api.common.typeutils.base.{ DoubleComparator, LongComparator }

case class LongTypeInformation(implicit s: TypeSerializer[Long]) extends AtomicTypeInformation[Long] {
  override def createComparator(sortOrderAscending: Boolean, executionConfig: ExecutionConfig): TypeComparator[Long] =
    new MappedComparator[java.lang.Long, Long](java.lang.Long.valueOf, new LongComparator(sortOrderAscending))
}
