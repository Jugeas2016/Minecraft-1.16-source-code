/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bos<T extends boq<?>>
/*    */ {
/*  9 */   public static final bos<bov> a = a("crafting_shaped", new bov.a());
/* 10 */   public static final bos<bow> b = a("crafting_shapeless", new bow.a());
/* 11 */   public static final bpa<bod> c = a("crafting_special_armordye", new bpa<>(bod::new));
/* 12 */   public static final bpa<bog> d = a("crafting_special_bookcloning", new bpa<>(bog::new));
/* 13 */   public static final bpa<boo> e = a("crafting_special_mapcloning", new bpa<>(boo::new));
/* 14 */   public static final bpa<bop> f = a("crafting_special_mapextending", new bpa<>(bop::new));
/* 15 */   public static final bpa<bok> g = a("crafting_special_firework_rocket", new bpa<>(bok::new));
/* 16 */   public static final bpa<bom> h = a("crafting_special_firework_star", new bpa<>(bom::new));
/* 17 */   public static final bpa<bol> i = a("crafting_special_firework_star_fade", new bpa<>(bol::new));
/* 18 */   public static final bpa<bpg> j = a("crafting_special_tippedarrow", new bpa<>(bpg::new));
/* 19 */   public static final bpa<boe> k = a("crafting_special_bannerduplicate", new bpa<>(boe::new));
/* 20 */   public static final bpa<box> l = a("crafting_special_shielddecoration", new bpa<>(box::new));
/* 21 */   public static final bpa<boy> m = a("crafting_special_shulkerboxcoloring", new bpa<>(boy::new));
/* 22 */   public static final bpa<bpf> n = a("crafting_special_suspiciousstew", new bpa<>(bpf::new));
/* 23 */   public static final bpa<bou> o = a("crafting_special_repairitem", new bpa<>(bou::new));
/* 24 */   public static final boz<bpc> p = a("smelting", new boz<>(bpc::new, 200));
/* 25 */   public static final boz<bof> q = a("blasting", new boz<>(bof::new, 100));
/* 26 */   public static final boz<bpd> r = a("smoking", new boz<>(bpd::new, 100));
/* 27 */   public static final boz<boh> s = a("campfire_cooking", new boz<>(boh::new, 100));
/* 28 */   public static final bos<bpe> t = a("stonecutting", new bpb.a<>(bpe::new));
/* 29 */   public static final bos<bph> u = a("smithing", new bph.a());
/*    */   
/*    */   T a(vk paramvk, JsonObject paramJsonObject);
/*    */   
/*    */   T a(vk paramvk, nf paramnf);
/*    */   
/*    */   void a(nf paramnf, T paramT);
/*    */   
/*    */   static <S extends bos<T>, T extends boq<?>> S a(String ☃, S s) {
/* 38 */     return (S)gm.<bos>a((gm)gm.ae, ☃, (bos)s);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bos.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */