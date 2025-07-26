package com.yama.nf.service;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.yama.nf.model.Pessoa;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class ItextPdfService {

    public byte[] gerarNotaFiscal(Pessoa pessoa) {
        try {
            Document document = new Document();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PdfWriter.getInstance(document, outputStream);
            document.open();

            document.add(new Paragraph("NOTA FISCAL "));
            document.add(new Paragraph("---------------------------------------------------"));
            document.add(new Paragraph("Nome: " + pessoa.getNomeCompleto()));
            document.add(new Paragraph("CPF: " + pessoa.getCpf()));
            document.add(new Paragraph("Endereço: " + pessoa.getEndereco()));
            document.add(new Paragraph("---------------------------------------------------"));
            document.add(new Paragraph("Obrigado pela preferência"));

            document.close();
            return outputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Erro para gerar o PDF", e);
        }
    }
}
