/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class ab
/*     */ {
/*  28 */   public static final ab a = new ab(0, new vk[0], new vk[0], cy.a.a);
/*     */   
/*     */   private final int b;
/*     */   private final vk[] c;
/*     */   private final vk[] d;
/*     */   private final cy.a e;
/*     */   
/*     */   public ab(int ☃, vk[] arrayOfVk1, vk[] arrayOfVk2, cy.a a1) {
/*  36 */     this.b = ☃;
/*  37 */     this.c = arrayOfVk1;
/*  38 */     this.d = arrayOfVk2;
/*  39 */     this.e = a1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aah ☃) {
/*  47 */     ☃.d(this.b);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     cyv cyv = (new cyv.a(☃.u())).<aqa>a(dbc.a, ☃).<dcn>a(dbc.f, ☃.cA()).a(☃.cY()).a(dbb.i);
/*     */     
/*  54 */     boolean bool = false;
/*  55 */     for (vk vk1 : this.c) {
/*  56 */       for (bmb bmb : ☃.c.aJ().a(vk1).a(cyv)) {
/*  57 */         if (☃.g(bmb)) {
/*  58 */           ☃.l.a((bfw)null, ☃.cD(), ☃.cE(), ☃.cH(), adq.gL, adr.h, 0.2F, ((☃.cY().nextFloat() - ☃.cY().nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*  59 */           bool = true; continue;
/*     */         } 
/*  61 */         bcv bcv = ☃.a(bmb, false);
/*  62 */         if (bcv != null) {
/*  63 */           bcv.n();
/*  64 */           bcv.b(☃.bS());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  69 */     if (bool) {
/*  70 */       ☃.bo.c();
/*     */     }
/*  72 */     if (this.d.length > 0) {
/*  73 */       ☃.a(this.d);
/*     */     }
/*  75 */     MinecraftServer minecraftServer = ☃.c;
/*  76 */     this.e.a(minecraftServer.aB())
/*  77 */       .ifPresent(cy1 -> ☃.aB().a(cy1, aah1.cw().a().a(2)));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  82 */     return "AdvancementRewards{experience=" + this.b + ", loot=" + 
/*     */       
/*  84 */       Arrays.toString((Object[])this.c) + ", recipes=" + 
/*  85 */       Arrays.toString((Object[])this.d) + ", function=" + this.e + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  91 */     if (this == a) {
/*  92 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  95 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  97 */     if (this.b != 0) {
/*  98 */       ☃.addProperty("experience", Integer.valueOf(this.b));
/*     */     }
/*     */     
/* 101 */     if (this.c.length > 0) {
/* 102 */       JsonArray jsonArray = new JsonArray();
/* 103 */       for (vk vk1 : this.c) {
/* 104 */         jsonArray.add(vk1.toString());
/*     */       }
/* 106 */       ☃.add("loot", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 109 */     if (this.d.length > 0) {
/* 110 */       JsonArray jsonArray = new JsonArray();
/* 111 */       for (vk vk1 : this.d) {
/* 112 */         jsonArray.add(vk1.toString());
/*     */       }
/* 114 */       ☃.add("recipes", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 117 */     if (this.e.a() != null) {
/* 118 */       ☃.addProperty("function", this.e.a().toString());
/*     */     }
/*     */     
/* 121 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static ab a(JsonObject ☃) throws JsonParseException {
/*     */     cy.a a1;
/* 126 */     int i = afd.a(☃, "experience", 0);
/* 127 */     JsonArray jsonArray1 = afd.a(☃, "loot", new JsonArray());
/* 128 */     vk[] arrayOfVk1 = new vk[jsonArray1.size()];
/* 129 */     for (int j = 0; j < arrayOfVk1.length; j++) {
/* 130 */       arrayOfVk1[j] = new vk(afd.a(jsonArray1.get(j), "loot[" + j + "]"));
/*     */     }
/* 132 */     JsonArray jsonArray2 = afd.a(☃, "recipes", new JsonArray());
/* 133 */     vk[] arrayOfVk2 = new vk[jsonArray2.size()];
/* 134 */     for (int k = 0; k < arrayOfVk2.length; k++) {
/* 135 */       arrayOfVk2[k] = new vk(afd.a(jsonArray2.get(k), "recipes[" + k + "]"));
/*     */     }
/*     */     
/* 138 */     if (☃.has("function")) {
/* 139 */       a1 = new cy.a(new vk(afd.h(☃, "function")));
/*     */     } else {
/* 141 */       a1 = cy.a.a;
/*     */     } 
/* 143 */     return new ab(i, arrayOfVk1, arrayOfVk2, a1);
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private int a;
/* 148 */     private final List<vk> b = Lists.newArrayList();
/* 149 */     private final List<vk> c = Lists.newArrayList();
/*     */     @Nullable
/*     */     private vk d;
/*     */     
/*     */     public static a a(int ☃) {
/* 154 */       return (new a()).b(☃);
/*     */     }
/*     */     
/*     */     public a b(int ☃) {
/* 158 */       this.a += ☃;
/* 159 */       return this;
/*     */     }
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
/*     */     public static a c(vk ☃) {
/* 172 */       return (new a()).d(☃);
/*     */     }
/*     */     
/*     */     public a d(vk ☃) {
/* 176 */       this.c.add(☃);
/* 177 */       return this;
/*     */     }
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
/*     */     public ab a() {
/* 190 */       return new ab(this.a, this.b.<vk>toArray(new vk[0]), this.c.<vk>toArray(new vk[0]), (this.d == null) ? cy.a.a : new cy.a(this.d));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */