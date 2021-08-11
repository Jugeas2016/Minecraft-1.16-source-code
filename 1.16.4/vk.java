/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import java.lang.reflect.Type;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vk
/*     */   implements Comparable<vk>
/*     */ {
/*  24 */   public static final Codec<vk> a = Codec.STRING.comapFlatMap(vk::c, vk::toString).stable();
/*  25 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("argument.id.invalid"));
/*     */ 
/*     */   
/*     */   protected final String b;
/*     */ 
/*     */   
/*     */   protected final String c;
/*     */ 
/*     */   
/*     */   protected vk(String[] ☃) {
/*  35 */     this.b = StringUtils.isEmpty(☃[0]) ? "minecraft" : ☃[0];
/*  36 */     this.c = ☃[1];
/*  37 */     if (!e(this.b)) {
/*  38 */       throw new v("Non [a-z0-9_.-] character in namespace of location: " + this.b + ':' + this.c);
/*     */     }
/*  40 */     if (!d(this.c)) {
/*  41 */       throw new v("Non [a-z0-9/._-] character in path of location: " + this.b + ':' + this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public vk(String ☃) {
/*  46 */     this(b(☃, ':'));
/*     */   }
/*     */   
/*     */   public vk(String ☃, String str1) {
/*  50 */     this(new String[] { ☃, str1 });
/*     */   }
/*     */   
/*     */   public static vk a(String ☃, char c) {
/*  54 */     return new vk(b(☃, c));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static vk a(String ☃) {
/*     */     try {
/*  60 */       return new vk(☃);
/*  61 */     } catch (v v) {
/*  62 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected static String[] b(String ☃, char c) {
/*  67 */     String[] arrayOfString = { "minecraft", ☃ };
/*  68 */     int i = ☃.indexOf(c);
/*  69 */     if (i >= 0) {
/*  70 */       arrayOfString[1] = ☃.substring(i + 1, ☃.length());
/*  71 */       if (i >= 1) {
/*  72 */         arrayOfString[0] = ☃.substring(0, i);
/*     */       }
/*     */     } 
/*     */     
/*  76 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   private static DataResult<vk> c(String ☃) {
/*     */     try {
/*  81 */       return DataResult.success(new vk(☃));
/*  82 */     } catch (v v) {
/*  83 */       return DataResult.error("Not a valid resource location: " + ☃ + " " + v.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public String a() {
/*  88 */     return this.c;
/*     */   }
/*     */   
/*     */   public String b() {
/*  92 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  97 */     return this.b + ':' + this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 102 */     if (this == ☃) {
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     if (☃ instanceof vk) {
/* 107 */       vk vk1 = (vk)☃;
/*     */       
/* 109 */       return (this.b.equals(vk1.b) && this.c.equals(vk1.c));
/*     */     } 
/*     */     
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 117 */     return 31 * this.b.hashCode() + this.c.hashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(vk ☃) {
/* 123 */     int i = this.c.compareTo(☃.c);
/* 124 */     if (i == 0) {
/* 125 */       i = this.b.compareTo(☃.b);
/*     */     }
/* 127 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<vk>, JsonSerializer<vk>
/*     */   {
/*     */     public vk a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 137 */       return new vk(afd.a(☃, "location"));
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(vk ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 142 */       return (JsonElement)new JsonPrimitive(☃.toString());
/*     */     }
/*     */   }
/*     */   
/*     */   public static vk a(StringReader ☃) throws CommandSyntaxException {
/* 147 */     int i = ☃.getCursor();
/* 148 */     while (☃.canRead() && a(☃.peek())) {
/* 149 */       ☃.skip();
/*     */     }
/* 151 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*     */     try {
/* 153 */       return new vk(str);
/* 154 */     } catch (v v) {
/* 155 */       ☃.setCursor(i);
/* 156 */       throw d.createWithContext(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(char ☃) {
/* 161 */     return ((☃ >= '0' && ☃ <= '9') || (☃ >= 'a' && ☃ <= 'z') || ☃ == '_' || ☃ == ':' || ☃ == '/' || ☃ == '.' || ☃ == '-');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean d(String ☃) {
/* 169 */     for (int i = 0; i < ☃.length(); i++) {
/* 170 */       if (!b(☃.charAt(i))) {
/* 171 */         return false;
/*     */       }
/*     */     } 
/* 174 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean e(String ☃) {
/* 178 */     for (int i = 0; i < ☃.length(); i++) {
/* 179 */       if (!c(☃.charAt(i))) {
/* 180 */         return false;
/*     */       }
/*     */     } 
/* 183 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean b(char ☃) {
/* 187 */     return (☃ == '_' || ☃ == '-' || (☃ >= 'a' && ☃ <= 'z') || (☃ >= '0' && ☃ <= '9') || ☃ == '/' || ☃ == '.');
/*     */   }
/*     */   
/*     */   private static boolean c(char ☃) {
/* 191 */     return (☃ == '_' || ☃ == '-' || (☃ >= 'a' && ☃ <= 'z') || (☃ >= '0' && ☃ <= '9') || ☃ == '.');
/*     */   }
/*     */   
/*     */   public static boolean b(String ☃) {
/* 195 */     String[] arrayOfString = b(☃, ':');
/* 196 */     return (e(StringUtils.isEmpty(arrayOfString[0]) ? "minecraft" : arrayOfString[0]) && d(arrayOfString[1]));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */