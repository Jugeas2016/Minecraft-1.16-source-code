/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class ah
/*     */ {
/*     */   private final nr a;
/*     */   private final nr b;
/*     */   private final bmb c;
/*     */   private final vk d;
/*     */   private final ai e;
/*     */   private final boolean f;
/*     */   private final boolean g;
/*     */   private final boolean h;
/*     */   private float i;
/*     */   private float j;
/*     */   
/*     */   public ah(bmb ☃, nr nr1, nr nr2, @Nullable vk vk1, ai ai1, boolean bool1, boolean bool2, boolean bool3) {
/*  33 */     this.a = nr1;
/*  34 */     this.b = nr2;
/*  35 */     this.c = ☃;
/*  36 */     this.d = vk1;
/*  37 */     this.e = ai1;
/*  38 */     this.f = bool1;
/*  39 */     this.g = bool2;
/*  40 */     this.h = bool3;
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1) {
/*  44 */     this.i = ☃;
/*  45 */     this.j = f1;
/*     */   }
/*     */   
/*     */   public nr a() {
/*  49 */     return this.a;
/*     */   }
/*     */   
/*     */   public nr b() {
/*  53 */     return this.b;
/*     */   }
/*     */   
/*     */   public bmb c() {
/*  57 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk d() {
/*  62 */     return this.d;
/*     */   }
/*     */   
/*     */   public ai e() {
/*  66 */     return this.e;
/*     */   }
/*     */   
/*     */   public float f() {
/*  70 */     return this.i;
/*     */   }
/*     */   
/*     */   public float g() {
/*  74 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  78 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean i() {
/*  82 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean j() {
/*  86 */     return this.h;
/*     */   }
/*     */   
/*     */   public static ah a(JsonObject ☃) {
/*  90 */     nr nr1 = nr.a.a(☃.get("title"));
/*  91 */     nr nr2 = nr.a.a(☃.get("description"));
/*  92 */     if (nr1 == null || nr2 == null) {
/*  93 */       throw new JsonSyntaxException("Both title and description must be set");
/*     */     }
/*  95 */     bmb bmb1 = b(afd.t(☃, "icon"));
/*  96 */     vk vk1 = ☃.has("background") ? new vk(afd.h(☃, "background")) : null;
/*  97 */     ai ai1 = ☃.has("frame") ? ai.a(afd.h(☃, "frame")) : ai.a;
/*  98 */     boolean bool1 = afd.a(☃, "show_toast", true);
/*  99 */     boolean bool2 = afd.a(☃, "announce_to_chat", true);
/* 100 */     boolean bool3 = afd.a(☃, "hidden", false);
/* 101 */     return new ah(bmb1, nr1, nr2, vk1, ai1, bool1, bool2, bool3);
/*     */   }
/*     */   
/*     */   private static bmb b(JsonObject ☃) {
/* 105 */     if (!☃.has("item")) {
/* 106 */       throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
/*     */     }
/* 108 */     blx blx = afd.i(☃, "item");
/* 109 */     if (☃.has("data")) {
/* 110 */       throw new JsonParseException("Disallowed data tag found");
/*     */     }
/* 112 */     bmb bmb1 = new bmb(blx);
/* 113 */     if (☃.has("nbt")) {
/*     */       try {
/* 115 */         md md = mu.a(afd.a(☃.get("nbt"), "nbt"));
/* 116 */         bmb1.c(md);
/* 117 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 118 */         throw new JsonSyntaxException("Invalid nbt tag: " + commandSyntaxException.getMessage());
/*     */       } 
/*     */     }
/*     */     
/* 122 */     return bmb1;
/*     */   }
/*     */   
/*     */   public void a(nf ☃) {
/* 126 */     ☃.a(this.a);
/* 127 */     ☃.a(this.b);
/* 128 */     ☃.a(this.c);
/* 129 */     ☃.a(this.e);
/* 130 */     int i = 0;
/* 131 */     if (this.d != null) {
/* 132 */       i |= 0x1;
/*     */     }
/* 134 */     if (this.f) {
/* 135 */       i |= 0x2;
/*     */     }
/* 137 */     if (this.h) {
/* 138 */       i |= 0x4;
/*     */     }
/* 140 */     ☃.writeInt(i);
/* 141 */     if (this.d != null) {
/* 142 */       ☃.a(this.d);
/*     */     }
/* 144 */     ☃.writeFloat(this.i);
/* 145 */     ☃.writeFloat(this.j);
/*     */   }
/*     */   
/*     */   public static ah b(nf ☃) {
/* 149 */     nr nr1 = ☃.h();
/* 150 */     nr nr2 = ☃.h();
/* 151 */     bmb bmb1 = ☃.n();
/* 152 */     ai ai1 = ☃.<ai>a(ai.class);
/* 153 */     int i = ☃.readInt();
/* 154 */     vk vk1 = ((i & 0x1) != 0) ? ☃.p() : null;
/* 155 */     boolean bool1 = ((i & 0x2) != 0);
/* 156 */     boolean bool2 = ((i & 0x4) != 0);
/* 157 */     ah ah1 = new ah(bmb1, nr1, nr2, vk1, ai1, bool1, false, bool2);
/* 158 */     ah1.a(☃.readFloat(), ☃.readFloat());
/* 159 */     return ah1;
/*     */   }
/*     */   
/*     */   public JsonElement k() {
/* 163 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 165 */     ☃.add("icon", (JsonElement)l());
/* 166 */     ☃.add("title", nr.a.b(this.a));
/* 167 */     ☃.add("description", nr.a.b(this.b));
/* 168 */     ☃.addProperty("frame", this.e.a());
/* 169 */     ☃.addProperty("show_toast", Boolean.valueOf(this.f));
/* 170 */     ☃.addProperty("announce_to_chat", Boolean.valueOf(this.g));
/* 171 */     ☃.addProperty("hidden", Boolean.valueOf(this.h));
/*     */     
/* 173 */     if (this.d != null) {
/* 174 */       ☃.addProperty("background", this.d.toString());
/*     */     }
/*     */     
/* 177 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   private JsonObject l() {
/* 181 */     JsonObject ☃ = new JsonObject();
/* 182 */     ☃.addProperty("item", gm.T.b(this.c.b()).toString());
/* 183 */     if (this.c.n()) {
/* 184 */       ☃.addProperty("nbt", this.c.o().toString());
/*     */     }
/* 186 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */