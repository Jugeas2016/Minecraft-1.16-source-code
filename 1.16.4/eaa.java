/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eaa
/*     */   extends ack<eaa.a>
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*  29 */   private static final vk b = new vk("gpu_warnlist.json");
/*     */   
/*  31 */   private ImmutableMap<String, String> c = ImmutableMap.of();
/*     */   private boolean d;
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   
/*     */   public boolean a() {
/*  37 */     return !this.c.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  41 */     return (a() && !this.e);
/*     */   }
/*     */   
/*     */   public void d() {
/*  45 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void e() {
/*  49 */     this.e = true;
/*     */   }
/*     */   
/*     */   public void f() {
/*  53 */     this.e = true;
/*  54 */     this.f = true;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  58 */     return (this.d && !this.e);
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  62 */     return this.f;
/*     */   }
/*     */   
/*     */   public void i() {
/*  66 */     this.d = false;
/*  67 */     this.e = false;
/*  68 */     this.f = false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String j() {
/*  73 */     return (String)this.c.get("renderer");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String k() {
/*  78 */     return (String)this.c.get("version");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String l() {
/*  83 */     return (String)this.c.get("vendor");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String m() {
/*  88 */     StringBuilder ☃ = new StringBuilder();
/*  89 */     this.c.forEach((str1, str2) -> ☃.append(str1).append(": ").append(str2));
/*  90 */     return (☃.length() == 0) ? null : ☃.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   protected a a(ach ☃, anw anw1) {
/*  95 */     List<Pattern> list1 = Lists.newArrayList();
/*  96 */     List<Pattern> list2 = Lists.newArrayList();
/*  97 */     List<Pattern> list3 = Lists.newArrayList();
/*     */     
/*  99 */     anw1.a();
/*     */     
/* 101 */     JsonObject jsonObject = c(☃, anw1);
/* 102 */     if (jsonObject != null) {
/* 103 */       anw1.a("compile_regex");
/*     */       
/* 105 */       a(jsonObject.getAsJsonArray("renderer"), list1);
/* 106 */       a(jsonObject.getAsJsonArray("version"), list2);
/* 107 */       a(jsonObject.getAsJsonArray("vendor"), list3);
/*     */       
/* 109 */       anw1.c();
/*     */     } 
/*     */     
/* 112 */     anw1.b();
/* 113 */     return new a(list1, list2, list3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(a ☃, ach ach1, anw anw1) {
/* 118 */     this.c = a.a(☃);
/*     */   }
/*     */   
/*     */   private static void a(JsonArray ☃, List<Pattern> list) {
/* 122 */     ☃.forEach(jsonElement -> ☃.add(Pattern.compile(jsonElement.getAsString(), 2)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static JsonObject c(ach ☃, anw anw1) {
/* 127 */     anw1.a("parse_json");
/*     */     
/* 129 */     JsonObject jsonObject = null;
/* 130 */     try(acg ☃ = ☃.a(b); 
/* 131 */         BufferedReader ☃ = new BufferedReader(new InputStreamReader(acg.b(), StandardCharsets.UTF_8))) {
/* 132 */       jsonObject = (new JsonParser()).parse(bufferedReader).getAsJsonObject();
/* 133 */     } catch (IOException|com.google.gson.JsonSyntaxException exception) {
/* 134 */       a.warn("Failed to load GPU warnlist");
/*     */     } 
/*     */     
/* 137 */     anw1.c();
/*     */     
/* 139 */     return jsonObject;
/*     */   }
/*     */   
/*     */   public static final class a {
/*     */     private final List<Pattern> a;
/*     */     private final List<Pattern> b;
/*     */     private final List<Pattern> c;
/*     */     
/*     */     private a(List<Pattern> ☃, List<Pattern> list1, List<Pattern> list2) {
/* 148 */       this.a = ☃;
/* 149 */       this.b = list1;
/* 150 */       this.c = list2;
/*     */     }
/*     */     
/*     */     private static String a(List<Pattern> ☃, String str) {
/* 154 */       List<String> list = Lists.newArrayList();
/* 155 */       for (Pattern pattern : ☃) {
/* 156 */         Matcher matcher = pattern.matcher(str);
/* 157 */         while (matcher.find()) {
/* 158 */           list.add(matcher.group());
/*     */         }
/*     */       } 
/* 161 */       return String.join(", ", (Iterable)list);
/*     */     }
/*     */     
/*     */     private ImmutableMap<String, String> a() {
/* 165 */       ImmutableMap.Builder<String, String> ☃ = new ImmutableMap.Builder();
/*     */       
/* 167 */       String str1 = a(this.a, den.c());
/* 168 */       if (!str1.isEmpty()) {
/* 169 */         ☃.put("renderer", str1);
/*     */       }
/*     */       
/* 172 */       String str2 = a(this.b, den.d());
/* 173 */       if (!str2.isEmpty()) {
/* 174 */         ☃.put("version", str2);
/*     */       }
/*     */       
/* 177 */       String str3 = a(this.c, den.a());
/* 178 */       if (!str3.isEmpty()) {
/* 179 */         ☃.put("vendor", str3);
/*     */       }
/*     */       
/* 182 */       return ☃.build();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */