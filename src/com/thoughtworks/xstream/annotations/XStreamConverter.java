// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.thoughtworks.xstream.annotations;

import java.lang.annotation.Annotation;

public interface XStreamConverter
    extends Annotation
{

    public abstract Class value();
}