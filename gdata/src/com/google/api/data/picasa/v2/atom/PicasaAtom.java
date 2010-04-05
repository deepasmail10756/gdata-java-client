// Copyright 2010 Google Inc. All Rights Reserved.

package com.google.api.data.picasa.v2.atom;

import com.google.api.data.client.v2.atom.NamespaceDictionary;

public final class PicasaAtom {

  public static final NamespaceDictionary NAMESPACE_DICTIONARY;
  static {
    NamespaceDictionary.Builder builder = new NamespaceDictionary.Builder();
    builder.addNamespace("", "http://www.w3.org/2005/Atom");
    builder.addNamespace("atom", "http://www.w3.org/2005/Atom");
    builder.addNamespace("exif", "http://schemas.google.com/photos/exif/2007");
    builder.addNamespace("gd", "http://schemas.google.com/g/2005");
    builder.addNamespace("geo", "http://www.w3.org/2003/01/geo/wgs84_pos#");
    builder.addNamespace("georss", "http://www.georss.org/georss");
    builder.addNamespace("gml", "http://www.opengis.net/gml");
    builder.addNamespace("gphoto", "http://schemas.google.com/photos/2007");
    builder.addNamespace("media", "http://search.yahoo.com/mrss/");
    builder.addNamespace("openSearch", "http://a9.com/-/spec/opensearch/1.1/");
    builder.addNamespace("xml", "http://www.w3.org/XML/1998/namespace");
    NAMESPACE_DICTIONARY = builder.build();
  }

  private PicasaAtom() {
  }
}