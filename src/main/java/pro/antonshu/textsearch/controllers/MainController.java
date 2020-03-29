package pro.antonshu.textsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/fld")
    public String submit(@RequestParam("files") MultipartFile[] files, ModelMap modelMap) throws IOException {

        for (MultipartFile file : files) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream(), "windows-1251"));
            List<String> strs = reader.lines().collect(Collectors.toList());
            List<String> procList = new ArrayList<>();
            strs.forEach(s -> procList.add(s.replace("sudo", "<span style=\"background-color: #eef00e;\"><b>sudo<a name=\"sudo\"></a></b></span>")));
            procList.forEach(System.out::println);
//            strs.forEach(s -> s.replace("sudo", "<b>sudo</b>"));
            modelMap.addAttribute("strings", procList);
            String searchText = "sudo";
            modelMap.addAttribute("sw", searchText);
        }
        modelMap.addAttribute("files", files);
        return "fileUploadView";
    }
}
