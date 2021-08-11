/*    */ package net.minecraft.data;
/*    */ import hl;
/*    */ import hm;
/*    */ import ho;
/*    */ import hv;
/*    */ import hw;
/*    */ import hx;
/*    */ import ie;
/*    */ import ik;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import java.util.Collection;
/*    */ import java.util.stream.Collectors;
/*    */ import jo;
/*    */ import joptsimple.AbstractOptionSpec;
/*    */ import joptsimple.ArgumentAcceptingOptionSpec;
/*    */ import joptsimple.OptionParser;
/*    */ import joptsimple.OptionSet;
/*    */ import joptsimple.OptionSpec;
/*    */ import joptsimple.OptionSpecBuilder;
/*    */ import jp;
/*    */ import jq;
/*    */ import js;
/*    */ import jt;
/*    */ import ju;
/*    */ import jv;
/*    */ import ks;
/*    */ 
/*    */ public class Main {
/*    */   public static void main(String[] ☃) throws IOException {
/* 32 */     OptionParser optionParser = new OptionParser();
/* 33 */     AbstractOptionSpec abstractOptionSpec = optionParser.accepts("help", "Show the help menu").forHelp();
/* 34 */     OptionSpecBuilder optionSpecBuilder1 = optionParser.accepts("server", "Include server generators");
/* 35 */     OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("client", "Include client generators");
/* 36 */     OptionSpecBuilder optionSpecBuilder3 = optionParser.accepts("dev", "Include development tools");
/* 37 */     OptionSpecBuilder optionSpecBuilder4 = optionParser.accepts("reports", "Include data reports");
/* 38 */     OptionSpecBuilder optionSpecBuilder5 = optionParser.accepts("validate", "Validate inputs");
/* 39 */     OptionSpecBuilder optionSpecBuilder6 = optionParser.accepts("all", "Include all generators");
/* 40 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec1 = optionParser.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", (Object[])new String[0]);
/* 41 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec2 = optionParser.accepts("input", "Input folder").withRequiredArg();
/* 42 */     OptionSet optionSet = optionParser.parse(☃);
/*    */     
/* 44 */     if (optionSet.has((OptionSpec)abstractOptionSpec) || !optionSet.hasOptions()) {
/* 45 */       optionParser.printHelpOn(System.out);
/*    */       
/*    */       return;
/*    */     } 
/* 49 */     Path path = Paths.get((String)argumentAcceptingOptionSpec1.value(optionSet), new String[0]);
/* 50 */     boolean bool1 = optionSet.has((OptionSpec)optionSpecBuilder6);
/* 51 */     boolean bool2 = (bool1 || optionSet.has((OptionSpec)optionSpecBuilder2));
/* 52 */     boolean bool3 = (bool1 || optionSet.has((OptionSpec)optionSpecBuilder1));
/* 53 */     boolean bool4 = (bool1 || optionSet.has((OptionSpec)optionSpecBuilder3));
/* 54 */     boolean bool5 = (bool1 || optionSet.has((OptionSpec)optionSpecBuilder4));
/* 55 */     boolean bool6 = (bool1 || optionSet.has((OptionSpec)optionSpecBuilder5));
/* 56 */     hl hl = a(path, (Collection<Path>)optionSet.valuesOf((OptionSpec)argumentAcceptingOptionSpec2).stream().map(☃ -> Paths.get(☃, new String[0])).collect(Collectors.toList()), bool2, bool3, bool4, bool5, bool6);
/* 57 */     hl.c();
/*    */   }
/*    */   
/*    */   public static hl a(Path ☃, Collection<Path> collection, boolean bool1, boolean bool2, boolean bool3, boolean bool4, boolean bool5) {
/* 61 */     hl hl = new hl(☃, collection);
/* 62 */     if (bool1 || bool2) {
/* 63 */       hl.a((hm)(new jp(hl))
/* 64 */           .a((jp.a)new jq()));
/*    */     }
/*    */ 
/*    */     
/* 68 */     if (bool1) {
/* 69 */       hl.a((hm)new ik(hl));
/*    */     }
/* 71 */     if (bool2) {
/* 72 */       hl.a((hm)new ju(hl));
/* 73 */       js js = new js(hl);
/* 74 */       hl.a((hm)js);
/* 75 */       hl.a((hm)new jv(hl, js));
/* 76 */       hl.a((hm)new jt(hl));
/* 77 */       hl.a((hm)new jg(hl));
/* 78 */       hl.a((hm)new ho(hl));
/* 79 */       hl.a((hm)new ie(hl));
/*    */     } 
/* 81 */     if (bool3) {
/* 82 */       hl.a((hm)new jo(hl));
/*    */     }
/* 84 */     if (bool4) {
/* 85 */       hl.a((hm)new hv(hl));
/* 86 */       hl.a((hm)new hx(hl));
/* 87 */       hl.a((hm)new hw(hl));
/* 88 */       hl.a((hm)new ks(hl));
/*    */     } 
/* 90 */     return hl;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\net\minecraft\data\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */