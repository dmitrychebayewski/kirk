@file:JvmName("Have")
package com.automation.remarks.kirk.conditions

/**
 * Created by sergey on 25.06.17.
 */
fun text(text: String) = Text(text)

fun size(size: Int) = CollectionSize(size)

fun sizeAtLeast(size: Int) = CollectionMinimumSize(size)

fun elementWithText(text: String) = CollectionContainText(text)

fun exactText(vararg text: String) = CollectionExactText(text)

fun attr(name: String, value: String) = AttributeValue(name, value)

fun cssClass(cssClass: String) = CssClassValue(cssClass)