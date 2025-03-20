package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val link = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc: Document =
        Jsoup.connect(link)
            .get()
    println(doc.title())
    val quotations: Elements = doc.select("article")

    for (quotation: Element in quotations) {
        println("\n${quotation.text()}")
    }
}