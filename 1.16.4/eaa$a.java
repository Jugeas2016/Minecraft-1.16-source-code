/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a
/*     */ {
/*     */   private final List<Pattern> a;
/*     */   private final List<Pattern> b;
/*     */   private final List<Pattern> c;
/*     */   
/*     */   private a(List<Pattern> ☃, List<Pattern> list1, List<Pattern> list2) {
/* 148 */     this.a = ☃;
/* 149 */     this.b = list1;
/* 150 */     this.c = list2;
/*     */   }
/*     */   
/*     */   private static String a(List<Pattern> ☃, String str) {
/* 154 */     List<String> list = Lists.newArrayList();
/* 155 */     for (Pattern pattern : ☃) {
/* 156 */       Matcher matcher = pattern.matcher(str);
/* 157 */       while (matcher.find()) {
/* 158 */         list.add(matcher.group());
/*     */       }
/*     */     } 
/* 161 */     return String.join(", ", (Iterable)list);
/*     */   }
/*     */   
/*     */   private ImmutableMap<String, String> a() {
/* 165 */     ImmutableMap.Builder<String, String> ☃ = new ImmutableMap.Builder();
/*     */     
/* 167 */     String str1 = a(this.a, den.c());
/* 168 */     if (!str1.isEmpty()) {
/* 169 */       ☃.put("renderer", str1);
/*     */     }
/*     */     
/* 172 */     String str2 = a(this.b, den.d());
/* 173 */     if (!str2.isEmpty()) {
/* 174 */       ☃.put("version", str2);
/*     */     }
/*     */     
/* 177 */     String str3 = a(this.c, den.a());
/* 178 */     if (!str3.isEmpty()) {
/* 179 */       ☃.put("vendor", str3);
/*     */     }
/*     */     
/* 182 */     return ☃.build();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaa$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */