// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.komanov.serialization.domain.protos.events



@SerialVersionUID(0L)
final case class FreeEntryPointAddedPb(
    userName: String = "",
    siteName: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[FreeEntryPointAddedPb] with com.trueaccord.lenses.Updatable[FreeEntryPointAddedPb] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      if (userName != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, userName) }
      if (siteName != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, siteName) }
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = userName
        if (__v != "") {
          output.writeString(1, __v)
        }
      };
      {
        val __v = siteName
        if (__v != "") {
          output.writeString(2, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.komanov.serialization.domain.protos.events.FreeEntryPointAddedPb = {
      var __userName = this.userName
      var __siteName = this.siteName
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __userName = __input.readString()
          case 18 =>
            __siteName = __input.readString()
          case tag => __input.skipField(tag)
        }
      }
      com.komanov.serialization.domain.protos.events.FreeEntryPointAddedPb(
          userName = __userName,
          siteName = __siteName
      )
    }
    def withUserName(__v: String): FreeEntryPointAddedPb = copy(userName = __v)
    def withSiteName(__v: String): FreeEntryPointAddedPb = copy(siteName = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = userName
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = siteName
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.komanov.serialization.domain.protos.events.FreeEntryPointAddedPb
}

object FreeEntryPointAddedPb extends com.trueaccord.scalapb.GeneratedMessageCompanion[FreeEntryPointAddedPb] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[FreeEntryPointAddedPb] = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.komanov.serialization.domain.protos.events.FreeEntryPointAddedPb = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.komanov.serialization.domain.protos.events.FreeEntryPointAddedPb(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = SrcMainProtoEventsProto.descriptor.getMessageTypes.get(26)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.komanov.serialization.domain.protos.events.FreeEntryPointAddedPb(
  )
  implicit class FreeEntryPointAddedPbLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, FreeEntryPointAddedPb]) extends com.trueaccord.lenses.ObjectLens[UpperPB, FreeEntryPointAddedPb](_l) {
    def userName: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.userName)((c_, f_) => c_.copy(userName = f_))
    def siteName: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.siteName)((c_, f_) => c_.copy(siteName = f_))
  }
  final val USERNAME_FIELD_NUMBER = 1
  final val SITENAME_FIELD_NUMBER = 2
}
