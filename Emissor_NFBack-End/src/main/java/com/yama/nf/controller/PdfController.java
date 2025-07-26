package com.yama.nf.controller;

import com.yama.nf.model.Pessoa;
import com.yama.nf.service.ItextPdfService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/pdf")
@RequiredArgsConstructor
public class PdfController {
    private final ItextPdfService itextPdfService;

    @PostMapping
    public ResponseEntity<byte[]> criarNotaFiscal(@RequestBody Pessoa pessoaDados) {
        byte[] pdfBytes = itextPdfService.gerarNotaFiscal(pessoaDados);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDisposition(
                ContentDisposition.inline().filename("Comprovante_Venda.pdf").build()
        );
        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
    }
}