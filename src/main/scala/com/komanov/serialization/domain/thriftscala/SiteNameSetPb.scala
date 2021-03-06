/**
 * Generated by Scrooge
 *   version: 4.7.0
 *   rev: d9d56174937f524a1981b38ebd6280eef7eeda4a
 *   built at: 20160427-121531
 */
package com.komanov.serialization.domain.thriftscala

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object SiteNameSetPb extends ThriftStructCodec3[SiteNameSetPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("SiteNameSetPb")
  val NameField = new TField("name", TType.STRING, 1)
  val NameFieldManifest = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      NameField,
      true,
      false,
      NameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: SiteNameSetPb): Unit = {
  }

  def withoutPassthroughFields(original: SiteNameSetPb): SiteNameSetPb =
    new Immutable(
      name =
        {
          val field = original.name
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: SiteNameSetPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): SiteNameSetPb = {

    var nameOffset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                nameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      nameOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): SiteNameSetPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): SiteNameSetPb = {
    var name: _root_.scala.Option[String] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                name = _root_.scala.Some(readNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      name,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    name: _root_.scala.Option[String] = _root_.scala.None
  ): SiteNameSetPb =
    new Immutable(
      name
    )

  def unapply(_item: SiteNameSetPb): _root_.scala.Option[_root_.scala.Option[String]] = _root_.scala.Some(_item.name)


  @inline private def readNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeNameField(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NameField)
    writeNameValue(name_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNameValue(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(name_item)
  }


  object Immutable extends ThriftStructCodec3[SiteNameSetPb] {
    override def encode(_item: SiteNameSetPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): SiteNameSetPb = SiteNameSetPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[SiteNameSetPb] = SiteNameSetPb.metaData
  }

  /**
   * The default read-only implementation of SiteNameSetPb.  You typically should not need to
   * directly reference this class; instead, use the SiteNameSetPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val name: _root_.scala.Option[String],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends SiteNameSetPb {
    def this(
      name: _root_.scala.Option[String] = _root_.scala.None
    ) = this(
      name,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      nameOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends SiteNameSetPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val name: _root_.scala.Option[String] =
      if (nameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, nameOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the SiteNameSetPb trait with additional state or
   * behavior and implement the read-only methods from SiteNameSetPb using an underlying
   * instance.
   */
  trait Proxy extends SiteNameSetPb {
    protected def _underlying_SiteNameSetPb: SiteNameSetPb
    override def name: _root_.scala.Option[String] = _underlying_SiteNameSetPb.name
    override def _passthroughFields = _underlying_SiteNameSetPb._passthroughFields
  }
}

trait SiteNameSetPb
  extends ThriftStruct
  with scala.Product1[Option[String]]
  with java.io.Serializable
{
  import SiteNameSetPb._

  def name: _root_.scala.Option[String]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = name


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (name.isDefined) {
                writeNameValue(name.get, _oprot)
                _root_.scala.Some(SiteNameSetPb.NameField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): SiteNameSetPb = {
    var name: _root_.scala.Option[String] = this.name
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        name = _root_.scala.Some(readNameValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      name,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): SiteNameSetPb = {
    var name: _root_.scala.Option[String] = this.name

    _fieldId match {
      case 1 =>
        name = _root_.scala.None
      case _ =>
    }
    new Immutable(
      name,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetName: SiteNameSetPb = unsetField(1)


  override def write(_oprot: TProtocol): Unit = {
    SiteNameSetPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (name.isDefined) writeNameField(name.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    name: _root_.scala.Option[String] = this.name,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): SiteNameSetPb =
    new Immutable(
      name,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[SiteNameSetPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[SiteNameSetPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 1

  override def productElement(n: Int): Any = n match {
    case 0 => this.name
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "SiteNameSetPb"
}